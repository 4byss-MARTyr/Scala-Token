class Manager (_name : String = "Manager",
               _balance : Int = 0,
               _token : Int = 10,
               private var _service : Int = 10)
  extends Human (_name,_balance, _token) {

  private var teachers = List(new Teacher()).take(0)

  def serviceCost : Int = _service
  def serviceCost_= (newValue : Int): Unit =
  {
    _service = newValue
  }

  def AddTeacher(teacher: Teacher): Unit =
  {
    teachers = teachers.appended(teacher)
  }


}