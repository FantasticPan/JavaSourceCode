package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/EndpointInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class EndpointInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public EndPointInfo value[] = null;

  public EndpointInfoListHolder ()
  {
  }

  public EndpointInfoListHolder (EndPointInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EndpointInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EndpointInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EndpointInfoListHelper.type ();
  }

}
