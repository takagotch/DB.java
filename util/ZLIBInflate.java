String data = "DATA";
byte[]byteData = data.getBytes();
byte[] deflatedData = new byte[256];

try{
  Deflater def = new Deflater();
  def.setInput(byteData);
  def.finish();
  def.deflate(deflateData);

  Inflater inf = new Inflater();
  inf.setInput(deflateData);

  byte[] inflateData = new byte[256];

  inf.inflate(inflatedData);
  System.out.print(new String(inflatedData));
}

