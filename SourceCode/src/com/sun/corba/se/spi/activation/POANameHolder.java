package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/POANameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class POANameHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public POANameHolder ()
  {
  }

  public POANameHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = POANameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    POANameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return POANameHelper.type ();
  }

}
