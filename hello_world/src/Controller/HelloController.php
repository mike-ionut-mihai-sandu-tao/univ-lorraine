<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\HttpFoundation\Request;

/**
 * Class HelloController
 * @package App\Controller
 * @Route(path="/", name="hello_")
 */
class HelloController extends AbstractController
{
    /**
     * @return Response
     * @Route("/hello", name="world")
     */
    public function hello(Request $request)
    {
        return $this->render('hello_world.html.twig');
    }

    /**
     * @return Response
     * @Route("/hello/{name}", name="name")
     */
    public function helloName(Request $request, $name)
    {
        return $this->render('hello_world.html.twig', [
            "name" => $name
        ]);
    }
}