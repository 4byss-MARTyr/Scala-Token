class Bank(_name : String = "Exchange",
           _balance : Int = 1000,
           _token : Int = 1000,
           private var _currency : Int = 1)
  extends Human (_name,_balance, _token)
{
  def currency = _currency
  def currency_= (newValue : Int) : Unit =
  {
    _currency = newValue
  }
}
