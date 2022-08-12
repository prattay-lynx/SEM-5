// Problem Statement
// 	Write a program to implement Dynamic Method Dispatch

// Output
// 	Box :: height=1, width=2, depth=3
// 	Box With Weight :: height=11, width=22, depth=33, weight=40
// 	Box With Dimension :: height=5, width=6, depth=7, Dimension=4


class Box{
	int height=1, width=1, depth=1;
	Box(int h, int w, int d){
		height=h; width=w; depth=d;
	}
	void showDimension(){
		System.out.println("Box :: height="+height+
			", width="+width+", depth="+depth+"\n");
	}
}

class BoxWithWeight extends Box{
	int weight;
	BoxWithWeight(int h, int w, int d, int wt){
		super(h,w,d);
		weight=wt;
	}
	void showDimension(){
		System.out.println("Box With Weight :: height="+height+
			", width="+width+", depth="+depth+", weight="+weight+"\n");
	}
}

class BoxWithDim extends Box{
	int dim;
	BoxWithDim(int h, int w, int d, int di){
		super(h,w,d);
		dim=di;
	}
	void showDimension(){
		System.out.println("Box With Dimension :: height="+height+
			", width="+width+", depth="+depth+", Dimension="+dim+"\n");
	}
}

public class DMDexample{
	public static void main(String[] args) {
		Box aBox = new Box(1,2,3);
		BoxWithWeight weightedBox = new BoxWithWeight(11,22,33,40);
		BoxWithDim dimmedBox = new BoxWithDim(5,6,7,4);

		Box boxRef;
		boxRef = aBox;
		boxRef.showDimension();

		boxRef=weightedBox;
		// System.out.println(boxRef.weight); //Compile Error Symbol not found
		boxRef.showDimension();

		boxRef = dimmedBox;
		boxRef.showDimension();
	}
}
