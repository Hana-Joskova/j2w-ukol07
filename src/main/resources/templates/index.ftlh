[#ftl]
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Můj blog</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
    <h1>Můj blog</h1>
    <ul>
        [#list posts.content as post]
        <li><a href="/post/${post.slug}">${post.title?no_esc}</a></li>
        [/#list]
    </ul>
</body>
</html>
