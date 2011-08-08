class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/test" {
			controller = { "home" }
			action     = { session.action ?: "index1" }
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
