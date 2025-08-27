import React, { useState, useEffect } from "react";
import {
  Phone,
  Wifi,
  Shield,
  Zap,
  CheckCircle,
  Menu,
  X,
  ArrowRight,
  Star,
  Users,
  Globe,
  PhoneCall,
} from "lucide-react";
import logo from "../resources/images.png";
import whats from "../resources/whats.png";
import fixed_phone from "../resources/fixed_phone.png";
export default function App() {
  const [isMenuOpen, setIsMenuOpen] = useState(false);
  const [currentSlide, setCurrentSlide] = useState(0);

  const heroSlides = [
    {
      title: "Conectividade de Última Geração",
      subtitle: "Internet fibra ótica com velocidade até 1GB",
      gradient: "from-blue-600 to-purple-600",
    },
    {
      title: "Cobertura Nacional 5G",
      subtitle: "Tecnologia 5G em mais de 500 cidades",
      gradient: "from-purple-600 to-pink-600",
    },
    {
      title: "Suporte 24/7",
      subtitle: "Atendimento especializado sempre disponível",
      gradient: "from-pink-600 to-blue-600",
    },
  ];

  useEffect(() => {
    const timer = setInterval(() => {
      setCurrentSlide((prev) => (prev + 1) % heroSlides.length);
    }, 5000);
    return () => clearInterval(timer);
  }, []);

  const services = [
    {
      icon: <Wifi className="w-8 h-8" />,
      title: "Internet Fibra",
      description: "Velocidades de até 1GB com estabilidade garantida",
      color: "from-blue-500 to-cyan-500",
    },
    {
      icon: <Phone className="w-8 h-8" />,
      title: "Telefonia Móvel",
      description: "Planos ilimitados com cobertura 5G nacional",
      color: "from-purple-500 to-pink-500",
    },
    {
      icon: <Shield className="w-8 h-8" />,
      title: "Segurança Digital",
      description: "Proteção completa contra ameaças online",
      color: "from-green-500 to-emerald-500",
    },
    {
      icon: <Zap className="w-8 h-8" />,
      title: "Soluções Empresariais",
      description: "Conectividade profissional para seu negócio",
      color: "from-orange-500 to-red-500",
    },
  ];

  const plans = [
    {
      name: "Essencial",
      speed: "200MB",
      price: "R$ 89",
      features: [
        "Internet fibra 200MB",
        "Wi-Fi grátis",
        "Suporte 24h",
        "Instalação gratuita",
      ],
    },
    {
      name: "Família",
      speed: "500MB",
      price: "R$ 129",
      features: [
        "Internet fibra 500MB",
        "Wi-Fi 6 premium",
        "Suporte prioritário",
        "Netflix incluído",
      ],
      popular: true,
    },
    {
      name: "Ultra",
      speed: "1GB",
      price: "R$ 199",
      features: [
        "Internet fibra 1GB",
        "Wi-Fi 6E",
        "Suporte VIP",
        "Streaming premium",
      ],
    },
  ];

  return (
    <div className="min-h-screen bg-white">
      <header className="bg-white/95 backdrop-blur-md shadow-lg sticky top-0 z-50">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="flex justify-between items-center py-4">
            <div className="flex items-center space-x-2">
              <div className="w-10 h-10 bg-gradient-to-r from-cyan-500 to-blue-500 rounded-lg flex items-center justify-center">
                <img src={logo} alt="logo" className="w-8 h-8" />
              </div>
              <span className="text-2xl font-bold bg-gradient-to-r from-cyan-500 to-blue-500 bg-clip-text text-transparent">
                Dominet
              </span>
            </div>

            <nav className="hidden md:flex space-x-8">
              <a
                href="#"
                className="text-gray-600 hover:text-blue-600 transition-colors font-medium"
              >
                Planos
              </a>
              <a
                href="#"
                className="text-gray-600 hover:text-blue-600 transition-colors font-medium"
              >
                Serviços
              </a>
              <a
                href="#"
                className="text-gray-600 hover:text-blue-600 transition-colors font-medium"
              >
                Empresas
              </a>
              <a
                href="#"
                className="text-gray-600 hover:text-blue-600 transition-colors font-medium"
              >
                Suporte
              </a>
              <a
                href="#"
                className="text-gray-600 hover:text-blue-600 transition-colors font-medium"
              >
                Contato
              </a>
            </nav>

            <div className="hidden md:flex items-center space-x-4">
              <button className="text-blue-600 hover:text-blue-700 font-medium">
                Login
              </button>
              <button className="bg-gradient-to-r from-cyan-500 to-blue-500 text-white px-6 py-2 rounded-full hover:shadow-lg transform hover:scale-105 transition-all duration-200">
                Assinar Agora
              </button>
            </div>

            <button
              className="md:hidden"
              onClick={() => setIsMenuOpen(!isMenuOpen)}
            >
              {isMenuOpen ? (
                <X className="w-6 h-6" />
              ) : (
                <Menu className="w-6 h-6" />
              )}
            </button>
          </div>
        </div>

        {/* Mobile Menu */}
        {isMenuOpen && (
          <div className="md:hidden bg-white border-t">
            <div className="px-4 py-2 space-y-2">
              <a href="#" className="block py-2 text-gray-600">
                Planos
              </a>
              <a href="#" className="block py-2 text-gray-600">
                Serviços
              </a>
              <a href="#" className="block py-2 text-gray-600">
                Empresas
              </a>
              <a href="#" className="block py-2 text-gray-600">
                Suporte
              </a>
              <a href="#" className="block py-2 text-gray-600">
                Contato
              </a>
              <div className="pt-2 space-y-2">
                <button className="block w-full text-left py-2 text-blue-600">
                  Login
                </button>
                <button className="block w-full bg-gradient-to-r from-cyan-500 to-blue-500 text-white py-2 rounded-full">
                  Assinar Agora
                </button>
              </div>
            </div>
          </div>
        )}
      </header>

      {/* Hero Section */}
      <section className="relative min-h-screen flex items-center overflow-hidden">
        <div
          className={`absolute inset-0 bg-gradient-to-br ${heroSlides[currentSlide].gradient} opacity-90`}
        ></div>
        <div className="absolute inset-0 bg-black/20"></div>

        {/* Animated background elements */}
        <div className="absolute inset-0">
          <div className="absolute top-1/4 left-1/4 w-64 h-64 bg-white/10 rounded-full blur-3xl animate-pulse"></div>
          <div className="absolute bottom-1/3 right-1/4 w-96 h-96 bg-white/5 rounded-full blur-3xl animate-pulse delay-1000"></div>
        </div>

        <div className="relative max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 text-center text-white">
          <h1 className="text-5xl md:text-7xl font-bold mb-6 leading-tight">
            {heroSlides[currentSlide].title}
          </h1>
          <p className="text-xl md:text-2xl mb-8 text-white/90">
            {heroSlides[currentSlide].subtitle}
          </p>
          <div className="flex flex-col sm:flex-row gap-4 justify-center items-center">
            <button className="bg-white text-gray-900 px-8 py-4 rounded-full font-semibold text-lg hover:shadow-xl transform hover:scale-105 transition-all duration-300 flex items-center">
              Ver Planos
              <ArrowRight className="ml-2 w-5 h-5" />
            </button>
            <button className="border-2 border-white text-white px-8 py-4 rounded-full font-semibold text-lg hover:bg-white hover:text-gray-900 transition-all duration-300">
              Teste de Velocidade
            </button>
          </div>
        </div>

        {/* Slide indicators */}
        <div className="absolute bottom-8 left-1/2 transform -translate-x-1/2 flex space-x-2">
          {heroSlides.map((_, index) => (
            <button
              key={index}
              onClick={() => setCurrentSlide(index)}
              className={`w-3 h-3 rounded-full transition-all ${
                index === currentSlide ? "bg-white" : "bg-white/50"
              }`}
            />
          ))}
        </div>
      </section>

      {/* Stats Section */}
      <section className="py-16 bg-gray-50">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="grid grid-cols-1 md:grid-cols-3 gap-8 text-center">
            <div className="p-6">
              <div className="text-4xl font-bold text-blue-600 mb-2">2M+</div>
              <div className="text-gray-600">Clientes Conectados</div>
            </div>
            <div className="p-6">
              <div className="text-4xl font-bold text-purple-600 mb-2">
                99.9%
              </div>
              <div className="text-gray-600">Disponibilidade</div>
            </div>
            <div className="p-6">
              <div className="text-4xl font-bold text-pink-600 mb-2">500+</div>
              <div className="text-gray-600">Cidades Atendidas</div>
            </div>
          </div>
        </div>
      </section>

      {/* Services Section */}
      <section className="py-20">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="text-center mb-16">
            <h2 className="text-4xl font-bold text-gray-900 mb-4">
              Nossos Serviços
            </h2>
            <p className="text-xl text-gray-600">
              Soluções completas em telecomunicações
            </p>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8">
            {services.map((service, index) => (
              <div
                key={index}
                className="group bg-white p-8 rounded-2xl shadow-lg hover:shadow-2xl transition-all duration-300 transform hover:-translate-y-2"
              >
                <div
                  className={`w-16 h-16 bg-gradient-to-r ${service.color} rounded-2xl flex items-center justify-center text-white mb-6 group-hover:scale-110 transition-transform`}
                >
                  {service.icon}
                </div>
                <h3 className="text-xl font-semibold mb-4">{service.title}</h3>
                <p className="text-gray-600">{service.description}</p>
              </div>
            ))}
          </div>
        </div>
      </section>

      {/* Plans Section */}
      <section className="py-20 bg-gradient-to-br from-gray-50 to-blue-50">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="text-center mb-16">
            <h2 className="text-4xl font-bold text-gray-900 mb-4">
              Planos que se Adaptam a Você
            </h2>
            <p className="text-xl text-gray-600">
              Escolha o plano ideal para suas necessidades
            </p>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
            {plans.map((plan, index) => (
              <div
                key={index}
                className={`relative bg-white rounded-3xl p-8 shadow-xl hover:shadow-2xl transition-all duration-300 transform hover:scale-105 ${
                  plan.popular ? "ring-4 ring-blue-500" : ""
                }`}
              >
                {plan.popular && (
                  <div className="absolute -top-4 left-1/2 transform -translate-x-1/2">
                    <span className="bg-gradient-to-r from-cyan-500 to-blue-500 text-white px-6 py-2 rounded-full text-sm font-semibold">
                      Mais Popular
                    </span>
                  </div>
                )}

                <div className="text-center mb-8">
                  <h3 className="text-2xl font-bold mb-2">{plan.name}</h3>
                  <div className="text-5xl font-bold text-blue-600 mb-2">
                    {plan.price}
                  </div>
                  <div className="text-gray-600">{plan.speed} • por mês</div>
                </div>

                <ul className="space-y-4 mb-8">
                  {plan.features.map((feature, featureIndex) => (
                    <li key={featureIndex} className="flex items-center">
                      <CheckCircle className="w-5 h-5 text-green-500 mr-3" />
                      <span className="text-gray-700">{feature}</span>
                    </li>
                  ))}
                </ul>

                <button
                  className={`w-full py-4 rounded-full font-semibold transition-all duration-300 ${
                    plan.popular
                      ? "bg-gradient-to-r from-cyan-500 to-blue-500 text-white hover:shadow-lg"
                      : "bg-gray-100 text-gray-900 hover:bg-gray-200"
                  }`}
                >
                  Assinar Agora
                </button>
              </div>
            ))}
          </div>
        </div>
      </section>

      {/* Testimonials Section */}
      <section className="py-20">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="text-center mb-16">
            <h2 className="text-4xl font-bold text-gray-900 mb-4">
              O que Nossos Clientes Dizem
            </h2>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
            {[
              {
                name: "Maria Silva",
                role: "Empresária",
                comment:
                  "A velocidade da internet é impressionante! Trabalho home office e nunca tive problemas.",
                rating: 5,
              },
              {
                name: "João Santos",
                role: "Gamer",
                comment:
                  "Zero lag nos jogos online. O melhor investimento que fiz para meu setup gamer.",
                rating: 5,
              },
              {
                name: "Ana Costa",
                role: "Estudante",
                comment:
                  "Suporte incrível! Sempre que preciso, sou atendida rapidamente.",
                rating: 5,
              },
            ].map((testimonial, index) => (
              <div key={index} className="bg-white p-6 rounded-2xl shadow-lg">
                <div className="flex mb-4">
                  {[...Array(testimonial.rating)].map((_, i) => (
                    <Star
                      key={i}
                      className="w-5 h-5 text-yellow-400 fill-current"
                    />
                  ))}
                </div>
                <p className="text-gray-600 mb-4">"{testimonial.comment}"</p>
                <div>
                  <div className="font-semibold">{testimonial.name}</div>
                  <div className="text-sm text-gray-500">
                    {testimonial.role}
                  </div>
                </div>
              </div>
            ))}
          </div>
        </div>
      </section>

      {/* CTA Section */}
      <section className="py-20 bg-gradient-to-r from-cyan-500 to-blue-500">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 text-center">
          <h2 className="text-4xl font-bold text-white mb-4">
            Pronto para se Conectar?
          </h2>
          <p className="text-xl text-white/90 mb-8">
            Junte-se a milhões de clientes satisfeitos
          </p>
          <button className="bg-white text-gray-900 px-8 py-4 rounded-full font-semibold text-lg hover:shadow-xl transform hover:scale-105 transition-all duration-300">
            Contrate Agora
          </button>
        </div>
      </section>

      <footer className="bg-gray-900 text-white py-16">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="grid grid-cols-1 md:grid-cols-4 gap-8">
            <div>
              <div className="flex items-center space-x-2 mb-4">
                <div className="w-8 h-8 bg-gradient-to-r from-cyan-500 to-blue-500 rounded-lg flex items-center justify-center">
                  <img src={logo} alt="logo" className="w-6 h-6" />
                </div>
                <span className="text-xl font-bold">Dominet</span>
              </div>
              <p className="text-gray-400">
                Conectando pessoas e empresas com tecnologia de ponta.
              </p>
            </div>

            <div>
              <h3 className="text-lg font-semibold mb-4">Contato</h3>
              <ul className="space-y-2 text-gray-400">
                <li>
                  <a
                    href="#"
                    className="grid grid-cols-[2rem_1fr] gap-3 items-center hover:text-white"
                  >
                    <img src={whats} alt="whats" className="w-8 h-8" />
                    <span>(64) 9 9250-2455</span>
                  </a>
                </li>
                <li>
                  <a
                    href="#"
                    className="grid grid-cols-[2rem_1fr] gap-3 items-center hover:text-white"
                  >
                    <img
                      src={fixed_phone}
                      alt="fixed_phone"
                      className="w-7 h-6 pl-1"
                    />
                    <span>(64) 3613-1148</span>
                  </a>
                </li>
              </ul>
            </div>

            <div>
              <h3 className="text-lg font-semibold mb-4">Suporte</h3>
              <ul className="space-y-2 text-gray-400">
                <li>
                  <a href="#" className="hover:text-white">
                    Central de Ajuda
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Status da Rede
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Contato
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Ouvidoria
                  </a>
                </li>
              </ul>
            </div>

            <div>
              <h3 className="text-lg font-semibold mb-4">Empresa</h3>
              <ul className="space-y-2 text-gray-400">
                <li>
                  <a href="#" className="hover:text-white">
                    Sobre Nós
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Carreiras
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Imprensa
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:text-white">
                    Investidores
                  </a>
                </li>
              </ul>
            </div>
          </div>

          <div className="border-t border-gray-800 mt-12 pt-8 text-center text-gray-400">
            <p>&copy; 2025 Dominet. Todos os direitos reservados.</p>
          </div>
        </div>
      </footer>
    </div>
  );
}
