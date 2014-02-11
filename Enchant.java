public boolean onCommand(CommandSender sender, Command command,
			String commandlabel, String[] args) {
		if(commandlabel.equalsIgnoreCase("oenchant")){ //만약 플레이어가 /oEnchant 를 사용한다면
			if(sender instanceof Player){ //만약 커맨드를 이용한사람이 플레이어면
				Player player = (Player)sender; //커맨드 전송자는 플레이어 player 이다
				player.openEnchanting(null, true); //인첸트창 을 연다
			}
		}
				return false;
	}