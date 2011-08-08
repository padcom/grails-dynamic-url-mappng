class HomeController {
	def index1 = {
		session.action = "index2"
		render text: "home/index1", contentType: "text/plain"
	}
	def index2 = {
		session.action = "index3"
		render text: "home/index2", contentType: "text/plain"
	}
	def index3 = {
		session.action = "index1"
		render text: "home/index3", contentType: "text/plain"
	}
}
