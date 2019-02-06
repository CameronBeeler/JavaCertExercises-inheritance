package com.cambeeler;

public
class ParentB
{
    public ParentB()
    {
        System.out.println("ParentB:  What should I expect? this->" + this.toString());
    }
    public String toString()
    {
        return "Inner";
    }
}
