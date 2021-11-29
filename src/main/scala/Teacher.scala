import scala.math.random

class Teacher(_name: String = "Teacher",
              _balance: Int = 0,
              _token: Int = 10,
              var _service : Int = 10)
  extends Human(_name, _balance, _token)
{
  def AddStudent(): Unit =
  {
    var mark = scala.util.Random;
    for (counter <- 0 to 5){
      _students = _students.appended(new Student("Student1", 10, 10, _mark = (mark.nextInt(5))))
    }
  }

  def StartTeaching(): Unit =
  {
    for (a <- _students.indices)
    {
      _students(a).Mining()
      if((_students(a).token-10)>0)
        _students(a).token -= 10
      this.token += 10
    }
  }
  private var _students = List(new Student()).take(0);

  def GetTeacherInfo(): Unit =
  {
    println(s"Name: ${_name}" + s"Balance: ${_balance}" + s"Token: ${_token}")
  }
  def GetStudentInfo(): Unit =
  {
    println(s"Name: ${_name}" + s"Balance: ${_balance}" + s"Token: ${_token}")
  }
}
