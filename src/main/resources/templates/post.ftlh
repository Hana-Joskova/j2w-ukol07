[#ftl]
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>${post.title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<h1>${post.title?no_esc}</h1>
<div>
    <p>${post.body?no_esc}</p>
</div>
<a href="/">Úvod</a>
</body>
</html>