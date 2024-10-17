package com.fatesg.vs01;

/**
 * Retangulo
 */
public class Retangulo {

  double height, width, area, perimeter;

  public Retangulo(double h, double w) {
    this.height = h;
    this.width = w;
    this.perimeter = getPerimeter();
    this.area = getArea();
  }

  public double getPerimeter() {
    double result = (2 * this.height) + (2 * this.width);
    return result;
  }

  public double getArea() {
    double result = this.width * this.height;
    return result;
  }
}
