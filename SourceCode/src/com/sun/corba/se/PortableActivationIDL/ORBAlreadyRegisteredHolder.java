package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ORBAlreadyRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class ORBAlreadyRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public ORBAlreadyRegistered value = null;

  public ORBAlreadyRegisteredHolder ()
  {
  }

  public ORBAlreadyRegisteredHolder (ORBAlreadyRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ORBAlreadyRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ORBAlreadyRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ORBAlreadyRegisteredHelper.type ();
  }

}
