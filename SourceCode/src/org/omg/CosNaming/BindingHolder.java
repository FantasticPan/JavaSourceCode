package org.omg.CosNaming;

/**
* org/omg/CosNaming/BindingHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, March 28, 2018 4:07:48 PM PDT
*/

public final class BindingHolder implements org.omg.CORBA.portable.Streamable
{
  public Binding value = null;

  public BindingHolder ()
  {
  }

  public BindingHolder (Binding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BindingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BindingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BindingHelper.type ();
  }

}
