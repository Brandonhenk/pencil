package edu.jalc.pencil.eraser.material;

public class Material{
  private final String materialType;

  public Material(String materialType){
    this.materialType = materialType;
  }

  public String getMaterialType(){
    return this.materialType;
  }
}
