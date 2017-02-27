package edu.jalc.pencil;

import edu.jalc.pencil.eraser.Eraser;
import edu.jalc.pencil.eraser.material.Material;

class Pencil{
  private Eraser eraser;

  public Pencil(Eraser eraser){
    this.setEraser(eraser);
  }

  Eraser setEraser(Eraser eraser){
    this.eraser = eraser;
    return this.eraser;
  }

  public Eraser getEraser(){
    return this.eraser;
  }
}
