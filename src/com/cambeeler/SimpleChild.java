package com.cambeeler;

public
class SimpleChild extends ParentB
{
    public SimpleChild()
    {
        String x = super.toString();
        System.out.println("SimpleChild Constructor " + x);
    }
    public String toString()
    {
        return super.toString().concat(" Peace");
    }
}
