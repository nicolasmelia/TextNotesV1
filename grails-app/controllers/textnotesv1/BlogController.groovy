package textnotesv1

class BlogController {
    def index() {		
		switch (params.blogID) {
			case "1":
				render (view: "blog_Using_Keywords")		
				break;
			case "2" :
				render (view: "blog_template ")		
				break;
			case "3":
				render (view: "blog_template ")		
				break;
				case "testBlog":
				render "Blog is currently Running: OK."
				break;
			default:
				// If blogID is not set
				render (view: "blog_Using_Keywords")
				break;			
		}	
	}	
}
