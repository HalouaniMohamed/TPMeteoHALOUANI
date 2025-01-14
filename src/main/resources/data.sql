INSERT INTO address (id, creation, content, author)
SELECT 1, CURRENT_TIMESTAMP(), '57 boulevard demorieux', 'author 1'
    WHERE NOT EXISTS (SELECT 1 FROM address WHERE id = 1);

INSERT INTO address (id, creation, content, author)
SELECT 2, CURRENT_TIMESTAMP(), '51 allee du gamay, 34080 montpellier', 'author 2'
    WHERE NOT EXISTS (SELECT 1 FROM address WHERE id = 2);

INSERT INTO address (id, creation, content, author)
SELECT 3, CURRENT_TIMESTAMP(), 'random address 3', 'author 3'
    WHERE NOT EXISTS (SELECT 1 FROM address WHERE id = 3);
