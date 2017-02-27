package edu.jalc.pencil.eraser;

import edu.jalc.pencil.eraser.material.Material;

public class Eraser{
  private Material material;

  public Eraser(Material material){
    this.setMaterial(material);
  }

  public Material getMaterial(){
    return this.material;
  }

  Material setMaterial(Material material){
    this.material = material;
    return this.material;
  }
}
