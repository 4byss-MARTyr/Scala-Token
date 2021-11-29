class Reserve(private var _token : Int = 1000) {


  def GiveToken() : Int =
  {
    this._token -= 100
    return 100
  }
}