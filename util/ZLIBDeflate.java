String data = "";
byte[] byteData = data.getBytes();
byte[] deflateData = new byte[256];

Deflater def = new Deflater();
def.setInput(byteData);
if(def.needsInput()){
  return;
}
def.finish();
def.deflate(deflatedData);
System.out.println("OUT" + def.getBytesWritten());
System.out.println("IN" + def.getBytesRead());

