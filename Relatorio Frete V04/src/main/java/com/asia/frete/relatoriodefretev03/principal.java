package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class principal implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private com.asia.frete.relatoriodefretev03.roteiro principal_roteiro;
   private com.asia.frete.relatoriodefretev03.containers principal_containers;
   private com.asia.frete.relatoriodefretev03.pedido principal_pedido;
   private com.asia.frete.relatoriodefretev03.item principal_item;
   private com.asia.frete.relatoriodefretev03.cliente principal_cliente;
   private java.math.BigDecimal principal_toal;
   private java.lang.String principal_link_erp;

   public principal()
   {
   }

   public com.asia.frete.relatoriodefretev03.roteiro getPrincipal_roteiro()
   {
      return this.principal_roteiro;
   }

   public void setPrincipal_roteiro(
         com.asia.frete.relatoriodefretev03.roteiro principal_roteiro)
   {
      this.principal_roteiro = principal_roteiro;
   }

   public com.asia.frete.relatoriodefretev03.containers getPrincipal_containers()
   {
      return this.principal_containers;
   }

   public void setPrincipal_containers(
         com.asia.frete.relatoriodefretev03.containers principal_containers)
   {
      this.principal_containers = principal_containers;
   }

   public com.asia.frete.relatoriodefretev03.pedido getPrincipal_pedido()
   {
      return this.principal_pedido;
   }

   public void setPrincipal_pedido(
         com.asia.frete.relatoriodefretev03.pedido principal_pedido)
   {
      this.principal_pedido = principal_pedido;
   }

   public com.asia.frete.relatoriodefretev03.item getPrincipal_item()
   {
      return this.principal_item;
   }

   public void setPrincipal_item(
         com.asia.frete.relatoriodefretev03.item principal_item)
   {
      this.principal_item = principal_item;
   }

   public com.asia.frete.relatoriodefretev03.cliente getPrincipal_cliente()
   {
      return this.principal_cliente;
   }

   public void setPrincipal_cliente(
         com.asia.frete.relatoriodefretev03.cliente principal_cliente)
   {
      this.principal_cliente = principal_cliente;
   }

   public java.math.BigDecimal getPrincipal_toal()
   {
      return this.principal_toal;
   }

   public void setPrincipal_toal(java.math.BigDecimal principal_toal)
   {
      this.principal_toal = principal_toal;
   }

   public java.lang.String getPrincipal_link_erp()
   {
      return this.principal_link_erp;
   }

   public void setPrincipal_link_erp(java.lang.String principal_link_erp)
   {
      this.principal_link_erp = principal_link_erp;
   }

   public principal(
         com.asia.frete.relatoriodefretev03.roteiro principal_roteiro,
         com.asia.frete.relatoriodefretev03.containers principal_containers,
         com.asia.frete.relatoriodefretev03.pedido principal_pedido,
         com.asia.frete.relatoriodefretev03.item principal_item,
         com.asia.frete.relatoriodefretev03.cliente principal_cliente,
         java.math.BigDecimal principal_toal,
         java.lang.String principal_link_erp)
   {
      this.principal_roteiro = principal_roteiro;
      this.principal_containers = principal_containers;
      this.principal_pedido = principal_pedido;
      this.principal_item = principal_item;
      this.principal_cliente = principal_cliente;
      this.principal_toal = principal_toal;
      this.principal_link_erp = principal_link_erp;
   }

}