package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncodingHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 28, 2018 4:07:49 PM PDT
*/

abstract public class InvalidTypeForEncodingHelper
{
  private static String  _id = "IDL:omg.org/IOP/Codec/InvalidTypeForEncoding:1.0";

  public static void insert (org.omg.CORBA.Any a, InvalidTypeForEncoding that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static InvalidTypeForEncoding extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (InvalidTypeForEncodingHelper.id (), "InvalidTypeForEncoding", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static InvalidTypeForEncoding read (org.omg.CORBA.portable.InputStream istream)
  {
    InvalidTypeForEncoding value = new InvalidTypeForEncoding ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, InvalidTypeForEncoding value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
