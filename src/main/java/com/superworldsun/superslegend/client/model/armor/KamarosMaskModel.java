package com.superworldsun.superslegend.client.model.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class KamarosMaskModel<T extends LivingEntity> extends EntityModel<T>
{
	public final ModelRenderer base;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public KamarosMaskModel()
	{
		texWidth = 64;
		texHeight = 64;

		base = new ModelRenderer(this);
		base.setPos(0.0F, 24.0F, 0.0F);
		base.texOffs(0, 0).addBox(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 5.0F, 0.0F, false);
		base.texOffs(16, 12).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);
		base.texOffs(6, 19).addBox(-4.01F, -8.0F, -5.0F, 0.0F, 8.0F, 3.0F, 0.0F, false);
		base.texOffs(0, 19).addBox(4.01F, -8.0F, -5.0F, 0.0F, 8.0F, 3.0F, 0.0F, false);
		base.texOffs(0, 9).addBox(-4.0F, -8.01F, -5.0F, 8.0F, 0.0F, 3.0F, 0.0F, false);
		base.texOffs(12, 14).addBox(-4.01F, -5.0F, -2.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		base.texOffs(0, 14).addBox(4.01F, -5.0F, -2.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		base.texOffs(19, 10).addBox(-4.0F, -5.0F, 4.01F, 8.0F, 2.0F, 0.0F, 0.0F, false);
		base.texOffs(0, 3).addBox(-4.01F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
		base.texOffs(0, 0).addBox(4.01F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
		base.texOffs(0, 5).addBox(-4.0F, -8.01F, -2.0F, 8.0F, 0.0F, 4.0F, 0.0F, false);
		base.texOffs(19, 4).addBox(-1.0F, -9.0F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		base.texOffs(12, 25).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		base.texOffs(21, 0).addBox(-1.0F, -11.0F, -5.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		base.texOffs(0, 12).addBox(-2.0F, -14.75F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		base.texOffs(25, 25).addBox(-0.5F, -15.5F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		base.texOffs(19, 25).addBox(-0.5F, -15.25F, -2.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		base.texOffs(20, 18).addBox(4.01F, -8.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		base.texOffs(12, 18).addBox(-4.01F, -8.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(2.0F, -13.25F, -5.5F);
		base.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-2.0F, -13.25F, -5.5F);
		base.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.texOffs(0, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}
	
	@Override
	public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_)
	{
		base.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
	
	@Override
	public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_)
	{
	}
}
