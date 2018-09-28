# Plataforma de gestión de retos gamificados y analíticas

Trabajo de Fin de Carrera, cuyo objetivo principal ha sido el desarrollo de una herramienta integrada y abierta para la gestión de retos, incluir elementos de gamificación y recolección de analíticas. La solución resultante propone una arquitectura modular y, para cada uno de los principales componentes, proporciona o bien una implementación de referencia para el módulo o bien reutilizando una aplicación existente para implementar la funcionalidad deseada. El resultado es un prototipo usable, completo y funcional de la arquitectura propuesta.

El módulo de retos que integra es Quiz, ubicado en: https://github.com/JorgeMerino/Quiz

Para el módulo de gamificación será necesario ejecutar en Vagrant el contenido de la carpeta sugarengine, utilizando los siguientes comandos:
  - vagrant up
  - vagrant ssh
  - cp -r /vagrant/sugarengine .
  - cd sugarengine
  - ./start.sh

Para detener la ejecución:
  - ./stop.sh
  - exit
  - vagrant halt
  
La aplicación se ejecutará en http://localhost:9000
