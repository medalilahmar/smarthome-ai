import { Component ,OnInit} from '@angular/core';
import * as AOS from 'aos';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit{
 teamMembers = [
    
    {
      name: 'Lahmar Mohamed Ali ',
      role: 'Ingénieur IA',
      bio: 'Etudiant en esprit',
      avatar: '👨‍🔬'
    }
  ];

  milestones = [
    { year: '2025', event: 'Idée initiale et premier prototype' },
    { year: '2026', event: 'Première levée de fonds' },
    { year: '2027', event: 'Lancement de la version bêta' },
    { year: '2027', event: 'Prix de l\'innovation technologique' },
    { year: '2028', event: '1 million d\'utilisateurs' }
  ];

  ngOnInit() {
    AOS.init({
      duration: 1000,
      once: true
    });
  }
}
