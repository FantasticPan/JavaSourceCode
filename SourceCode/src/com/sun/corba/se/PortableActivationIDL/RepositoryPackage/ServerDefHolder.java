package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;

/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/ServerDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class ServerDefHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerDef value = null;

  public ServerDefHolder ()
  {
  }

  public ServerDefHolder (ServerDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerDefHelper.type ();
  }

}