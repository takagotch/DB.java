try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	PrepareStatement ps1 = con.prepareStatement(
		"REPLACE INTO picture_list(id,contents) VALUES(1,?)");
	PrepareStatement ps2 = con2.prepareStatement(
	"SELECT contents FROM picture_list WHERE id=?");) {
		
	File fin = new File("chap7/sky.jpg");
	try(FileInputStream in = new FileInputStream(fin)){
		
		//
		ps1.setBinaryStream(1, in,fin.length());
		ps1.executeUpdate();
		
		//
		ps2.setInt(1, 1);
		ResultSet rs = ps2.executeQuery();
		rs.next();
		
		//
		BufferedImage img = ImageIO.read( rs.getBinaryStream(1) );
		Icon icon = new ImageIcon(img);
		//
		JOptionPane.showMessageDialog(null, "", "",
									JOptionPane.PLAIN_MESSAGE, icon );
	}
	catch (IOException e) {
	}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
