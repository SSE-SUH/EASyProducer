package simulator.model;
/**
 * Diese Klasse stellt einen Fahrstuhl dar.
 */
public class Elevator {
	
	private boolean bDoorOpen = false;
	private int iDirection = 0;
	private int iCurrentFloor = 0;
	private boolean bKeepDoorsOpen = false;
	private boolean bCloseDoorsNow = false;
	

	/**
	 * @return the bDoorOpen
	 */	
	public boolean isDoorOpen() {
		return bDoorOpen;
	}
	
	/**
	 * @return the bKeepDoorsOpen
	 */
	public boolean isbKeepDoorsOpen() {
		return bKeepDoorsOpen;
	}
	
	/**
	 * @param bKeepDoorsOpen the bKeepDoorsOpen to set
	 */
	public void setbKeepDoorsOpen(boolean bKeepDoorsOpen) {
		this.bKeepDoorsOpen = bKeepDoorsOpen;
	}
	
	/**
	 * @return the bCloseDoorsNow
	 */
	public boolean isbCloseDoorsNow() {
		return bCloseDoorsNow;
	}
	
	/**
	 * @param bCloseDoorsNow the bCloseDoorsNow to set
	 */
	public void setbCloseDoorsNow(boolean bCloseDoorsNow) {
		this.bCloseDoorsNow = bCloseDoorsNow;
	}
	
	/**
	 * @param bDoorOpen the bDoorOpen to set
	 */
	public void setDoorOpen(boolean bDoorOpen) {
		this.bDoorOpen = bDoorOpen;
	}
	
	/**
	 * @return the iDirection
	 */
	public int getDirection() {
		return iDirection;
	}
	
	/**
	 * @param iDirection the iDirection to set
	 */
	public void setDirection(int iDirection) {
		this.iDirection = iDirection;
	}
	
	/**
	 * @return the iCurrentFloor
	 */
	public int getCurrentFloor() {
		return iCurrentFloor;
	}
	
	/**
	 * @param iCurrentFloor the iCurrentFloor to set
	 */
	public void setCurrentFloor(int iCurrentFloor) {
		this.iCurrentFloor = iCurrentFloor;
	}

}
