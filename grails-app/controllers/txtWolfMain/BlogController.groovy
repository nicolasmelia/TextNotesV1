package txtWolfMain

class BlogController {
    def index() {		
		switch (params.blogID) {
			case "1":
				render (view: "blog_Using_Keywords")		
				break;
			case "2" :
				render (view: "blog_growingWithTxtWolf")		
				break;
			case "3":
				render (view: "blog_engagement101")		
				break;
			case "4":
				render (view: "blog_success_1")
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
