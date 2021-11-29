object Main extends App {
  var node = new Node()

  node.FillTeachers()
  node.Process()

  var t = new Teacher()
  t.AddStudent()


  for (a <- 0 to 10)
  {
    t.StartTeaching()
    t.GetStudentInfo()
  }
}