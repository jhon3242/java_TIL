package Ex_47_interface_inherit;

abstract public class TVCR extends Tv implements IVCR{
	VCR vcr = new VCR();
	public void play(){
		vcr.play();
	}
	public void stop(){
		vcr.stop();
	}
	public void reset(){
		vcr.reset();
	}
	public int getCounter(){
		return vcr.getCounter();
	}
//	public void setCounter(int c);{
//		vcr.setCounter(c);
//	}
}
