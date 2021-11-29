import scala.util.Random

class Student(_name: String = "Student",
              _balance: Int = 0,
              _token: Int = 10,
              _mark: Int = Random.nextInt(5))
  extends Human(_name, _balance, _token)
{
  private var mark: Int = _mark;

  def Mining(): Unit =
  {
    _mark match {
      case 1 => this.token+=0
      case 2 => this.token+=5
      case 3 => this.token+=7
      case 4 => this.token+=10
      case 5 => this.token+=15
    }
  }
}

