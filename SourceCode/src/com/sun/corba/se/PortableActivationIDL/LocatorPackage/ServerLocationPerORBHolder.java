package com.sun.corba.se.PortableActivationIDL.LocatorPackage;

/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerORBHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class ServerLocationPerORBHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerLocationPerORB value = null;

  public ServerLocationPerORBHolder ()
  {
  }

  public ServerLocationPerORBHolder (ServerLocationPerORB initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerLocationPerORBHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerLocationPerORBHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerLocationPerORBHelper.type ();
  }

}
