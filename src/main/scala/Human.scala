class Human(_name: String = "Human",
            _balance: Int = 0,
            var _token: Int = 10)
{
  def name : String = _name
  def name_= (newValue : String): Unit = {
    name = newValue
  }
  def balance: Int = _balance
  def balance_= (newValue : Int): Unit =
  {
    balance = newValue
  }
  def token : Int = _token
  def token_= (newValue : Int):Unit =
  {
    _token = token
  }
  def GetHumanInfo(): Unit = {
    println(s"Name: ${_name}" + s"Balance: ${_balance}" + s"Token: ${_token}")
  }
}
