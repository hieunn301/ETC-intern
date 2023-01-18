import 'package:flutter/material.dart';
import 'package:flutter_trello/routes.dart';
import 'package:flutter_trello/screens/splash/splash_screen.dart';
import 'package:flutter_trello/theme.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: theme(),
      initialRoute: SplashScreen.routeName,
      routes: routes,
    );
  }
}
