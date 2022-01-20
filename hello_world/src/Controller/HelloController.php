<?php

namespace App\Controller;

use http\Env\Request;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Routing\Annotation\Route;

/**
 * Class HelloController
 * @package App\Controller
 * @Route(path="/hello", name="hello_")
 */
class HelloController extends AbstractController
{
    /**
     * @return Response
     * @Route("", name="world")
     */
    public function hello()
    {
        return $this->render('hello_world.html.twig');
    }

    /**
     * @return Response
     * @Route("/{name}", name="world")
     */
    public function helloName($name)
    {
        return $this->render('hello_world.html.twig', [
            "name" => $name
        ]);
    }

}