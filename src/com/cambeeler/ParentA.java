package com.cambeeler;

public
class ParentA implements iParentA
{
    private static int    objectCount                = 0;
    private        int    printHelloWorldMethodCount = 0;
    private        String JAVAAuthor                 = "Cam";

    public
    ParentA()
    {
        this.objectCount++;
        System.out.println(objectCount + " iParentA objects instantiated");
    }

    public
    ParentA( String JAVAAuthor)
    {
        this.JAVAAuthor = JAVAAuthor;
        System.out.println(++objectCount + " iParentA objects instantiated");
    }

    public void setJAVAAuthor(String author)
    {
        this.JAVAAuthor=author;
    }

    public String getJAVAAuthor()
    {
        return this.JAVAAuthor;
    }

    public int getObjectCount()
    {
       return this.objectCount;
    }
    @Override
    public
    void helloWorld()
    {
        System.out.println("ParentA implements iParentA:  Howdy everyone - count#" + (++printHelloWorldMethodCount));
    }

    @Override
    public
    void goodBye()
    {
        System.out.println("ParentA implements implements iParentA:  Adios!");
    }

    public void setPrintHelloWorld()
    {
        printHelloWorldMethodCount++;
        System.out.println("ParentA:  Greetings to the World! - printed #" + printHelloWorldMethodCount + " times!");
    }
}
