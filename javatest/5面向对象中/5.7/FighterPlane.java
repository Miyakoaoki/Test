class FighterPlane extends Plane
{
  private int missileNum;
  public void setNum(int _missileNum){
    missileNum = _missileNum;
  }
  public void fire(){
   missileNum -= 1;
  }
}
