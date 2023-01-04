package com.superworldsun.superslegend.entities.projectiles.seeds;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public abstract class SeedEntity extends AbstractArrowEntity {
	private static final double BASE_DAMAGE = 2.0D;

	public SeedEntity(EntityType<? extends SeedEntity> type, World world) {
		super(type, world);
	}

	public SeedEntity(EntityType<? extends SeedEntity> entityType, LivingEntity shooter, World worldIn) {
		super(entityType, shooter, worldIn);
	}

	@Override
	public void onAddedToWorld() {
		super.onAddedToWorld();
		setBaseDamage(BASE_DAMAGE);
	}

	@Override
	public void shoot(double motionX, double motionY, double motionZ, float speed, float deviation) {
		super.shoot(motionX, motionY, motionZ, speed * getFlightSpeed(), deviation);
	}

	@Override
	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public void tick() {
		super.tick();

		if (!isNoPhysics()) {
			Vector3d previousMovement = getDeltaMovement();
			setDeltaMovement(previousMovement.x, previousMovement.y - getMass(), previousMovement.z);
		}

		if (inGround) {
			remove();
		}
	}

	@Override
	public boolean isNoGravity() {
		return true;
	}

	@Override
	protected SoundEvent getDefaultHitGroundSoundEvent() {
		return SoundEvents.BAMBOO_BREAK;
	}

	@Override
	protected void onHitEntity(EntityRayTraceResult result) {
		super.onHitEntity(result);

		if (result.getEntity() instanceof LivingEntity) {
			LivingEntity target = (LivingEntity) result.getEntity();

			if (!level.isClientSide && getPierceLevel() <= 0) {
				target.setArrowCount(target.getArrowCount() - 1);
			}
		}
	}

	protected float getMass() {
		return 0.05F;
	}

	private float getFlightSpeed() {
		return 1F;
	}
}