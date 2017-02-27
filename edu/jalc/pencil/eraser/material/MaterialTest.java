package edu.jalc.pencil.eraser.material;
import edu.jalc.pencil.eraser.material.Material;

public class MaterialTest{
  public void getMaterialTypeTest(){
    System.out.println("Testing Material :: getMaterialType");
    Material material = new Material("rubber");
    assert(material.getMaterialType().equals("rubber"));
  }

  public static void main(String[] args){
    MaterialTest materialTest = new MaterialTest();
    materialTest.getMaterialTypeTest();
    System.out.println("Test is complete");
  }
}
