		if (mark.equals("ジョーカー")) {
			this.Priority = 5;
		} else if (mark.equals("スペード")) {
			this.Priority = 4;
		} else if (mark.equals("ハート")) {
			this.Priority = 3;
		} else if (mark.equals("ダイヤ")) {
			this.Priority = 2;
		} else if (mark.equals("クラブ")) {
			this.Priority = 1;
		if (Integer.compare(this.Number, anotherCard.getPower()) == 0) {
			return Integer.compare(this.Priority, anotherCard.Priority);
		}
