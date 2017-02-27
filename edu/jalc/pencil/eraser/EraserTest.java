package edu.jalc.pencil.eraser;
import edu.jalc.pencil.eraser.Eraser;
import edu.jalc.pencil.eraser.material.Material;

public class EraserTest{
  public void getMaterialTest(){
    System.out.println("Testing Eraser :: getMaterial");
    Material material = new Material("rubber");
    Eraser eraser = new Eraser(material);
    assert(eraser.getMaterial() == material);
  }

  public void setMaterialTest(){
    System.out.println("Testing Eraser :: setEraser");
    Material material = new Material("rubber");
    Eraser eraser = new Eraser(material);
    assert(eraser.setMaterial(material) == material);
  }

  public static void main(String[] args){
    EraserTest eraserTest = new EraserTest();
    eraserTest.getMaterialTest();
    eraserTest.setMaterialTest();
    System.out.println("Test is complete");
  }
}
