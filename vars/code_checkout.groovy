def call(String GitUrl, String GitBranch) {
  def gitResult = git url: "${GitUrl}", branch: "${GitBranch}"
  return gitResult
}
