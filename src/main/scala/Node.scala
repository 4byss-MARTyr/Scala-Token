import scala.util.Random
class Node(_name : String = "Node",
           _balance : Int = 0,
           _token : Int = 0)
  extends Human (_name, _balance, _token) {

  private var teacherList = List(new Teacher()).take(0)
  private var managerList = List(new Manager()).take(0)

  var exchange = new Exchange()
  var reserve = new Reserve()

  def Process(): Unit =
  {
    if(this._token<=0)
      this.token += reserve.GiveToken()
    for(a <- teacherList.indices)
    {
      teacherList(a).StartTeaching()
    }

  }


  def FillTeachers() : Unit =
  {
    for(a <- 1 to 3)
    {
      teacherList = teacherList.appended(new Teacher(_name = s"Teacher${teacherList.length + 1}"))
    }
  }


}