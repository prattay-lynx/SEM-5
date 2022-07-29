class AnotherBox{
	int height, width, depth;
	AnotherBox(int h, int w, int d){
		height = h; width = w; depth = d;
	}

	AnotherBox giveINCRBoxObject(){
		return (new AnotherBox(height+10, width+10, depth+10));
	}
}

class AnotherBoxDemo{
	public static void main(String[] args) {
		AnotherBox ob = new AnotherBox(2,3,4);
		AnotherBox ob2 = ob.giveINCRBoxObject();
		System.out.printf("Box object  height=%d, width=%d, depth=%d.\n",
							ob.height, ob.width, ob.depth);
		System.out.printf("Box object (Incremented) height=%d, width=%d, depth=%d.\n",
							ob2.height, ob2.width, ob2.depth);
	}
}