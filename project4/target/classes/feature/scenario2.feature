Feature:working on amazon page

	Scenario: web application
		Given user opens amazon page
		When page is opened
		Then capture all the links
		Then get url get title
		And store in the excel sheet and close the browser
		