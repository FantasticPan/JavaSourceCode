package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 28, 2018 4:07:49 PM PDT
*/


/** An array of tagged components, forming a multiple component profile. */
public final class MultipleComponentProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public TaggedComponent value[] = null;

  public MultipleComponentProfileHolder ()
  {
  }

  public MultipleComponentProfileHolder (TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MultipleComponentProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MultipleComponentProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MultipleComponentProfileHelper.type ();
  }

}
