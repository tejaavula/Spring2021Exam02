/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Example2;

/**
 *
 * @author Tejaswi Avula
 */
public abstract class InterfaceExample2a implements InterfaceExample2{
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x, y;

    public InterfaceExample2a(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Multiply() {
        return x * y;
    }

}
