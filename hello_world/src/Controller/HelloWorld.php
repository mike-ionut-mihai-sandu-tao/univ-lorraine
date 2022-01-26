<?php
// src/Controller/LuckyController.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;

class HelloWorld extends AbstractController {
    public function hello(): Response {

        return new Response(
            '<html><body>Hello World</body></html>'
        );
    }
}